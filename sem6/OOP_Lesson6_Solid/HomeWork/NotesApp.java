import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NotesApp {
    private static final String NOTES_FILE = "notes.txt";
    private static List<Note> notes;
    private static int nextId;

    public static void main(String[] args) {
        notes = loadNotes();
        nextId = getNextId();

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("==== Записки ====");
            System.out.println("1. Показать все записки");
            System.out.println("2. Создать новую записку");
            System.out.println("3. Редактировать записку");
            System.out.println("4. Удалить записку");
            System.out.println("5. Показать записку по ID");
            System.out.println("0. Выйти");

            System.out.print("Выберите действие: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    displayAllNotes();
                    break;
                case 2:
                    createNote();
                    break;
                case 3:
                    editNote();
                    break;
                case 4:
                    deleteNote();
                    break;
                case 5:
                    displayNoteById();
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Некорректный выбор. Попробуйте снова.");
                    break;
            }

            System.out.println();
        }

        saveNotes();
    }

    private static void displayAllNotes() {
        System.out.println("Все записки:");
        if (notes.isEmpty()) {
            System.out.println("Нет записок.");
        } else {
            for (Note note : notes) {
                System.out.println(note);
            }
        }
    }

    private static void createNote() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите заголовок: ");
        String title = scanner.nextLine();

        System.out.print("Введите текст: ");
        String text = scanner.nextLine();

        Note note = new Note(nextId++, title, text);
        notes.add(note);

        System.out.println("Записка создана: " + note);
    }

    private static void editNote() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ID записки для редактирования: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Note note = findNoteById(id);
        if (note != null) {
            System.out.print("Введите новый заголовок: ");
            String newTitle = scanner.nextLine();
            note.setTitle(newTitle);

            System.out.print("Введите новый текст: ");
            String newText = scanner.nextLine();
            note.setText(newText);

            System.out.println("Записка успешно отредактирована: " + note);
        } else {
            System.out.println("Записка с ID " + id + " не найдена.");
        }
    }

    private static void deleteNote() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ID записки для удаления: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Note note = findNoteById(id);
        if (note != null) {
            notes.remove(note);
            System.out.println("Записка успешно удалена: " + note);
        } else {
            System.out.println("Записка с ID " + id + " не найдена.");
        }
    }

    private static void displayNoteById() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ID записки для показа: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Note note = findNoteById(id);
        if (note != null) {
            System.out.println(note);
        } else {
            System.out.println("Записка с ID " + id + " не найдена.");
        }
    }

    private static Note findNoteById(int id) {
        for (Note note : notes) {
            if (note.getId() == id) {
                return note;
            }
        }
        return null;
    }

    private static List<Note> loadNotes() {
        List<Note> loadedNotes = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(NOTES_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");

                int id = Integer.parseInt(parts[0]);
                String title = parts[1];
                String text = parts[2];

                Note note = new Note(id, title, text);
                loadedNotes.add(note);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
        return loadedNotes;
    }

    private static void saveNotes() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(NOTES_FILE))) {
            for (Note note : notes) {
                writer.write(note.getId() + ";" + note.getTitle() + ";" + note.getText());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Ошибка при записи файла: " + e.getMessage());
        }
    }

    private static int getNextId() {
        if (notes.isEmpty()) {
            return 1;
        } else {
            int maxId = 0;
            for (Note note : notes) {
                if (note.getId() > maxId) {
                    maxId = note.getId();
                }
            }
            return maxId + 1;
        }
    }
}
