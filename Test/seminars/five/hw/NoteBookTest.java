package seminars.five.hw;

import org.junit.jupiter.api.Test;

public class NoteBookTest {

    @Test
    void correctGetNameContactTest() {
        // юнит-тест проверка корректности возврата имени контакта
    }

    @Test
    void correctSetNameContactTest() {
        // юнит-тест проверка корректности установки имени контакта
    }

    @Test
    void correctGetNumberContactTest() {
        // юнит-тест проверка корректности возврата номера контакта
    }

    @Test
    void correctSetNumberContactTest() {
        // юнит-тест проверка корректности установки номера контакта
    }

    @Test
    void saveNoteRepositoryTest() {
        // юнит-тест проверка сохранения блокнота в репозитории
    }

    @Test
    void loadNoteRepositoryTest() {
        // юнит-тест проверка корректности чтения блокнота из репозитория
    }

    @Test
    void addContactServiceNoteTest() {
        // интеграционный тест проверка добавления контакта в блокнот из репозитория пользователя
    }

    @Test
    void deleteContactServiceNoteTest() {
        // интеграционный тест проверка удаления контакта в блокноте из репозитория пользователя
    }

    @Test
    void updateContactServiceNoteTest() {
        // интеграционный тест проверка изменения контакта в блокноте из репозитория пользователя
    }

    @Test
    void correctWorkerContactServiceNoteGUITest() {
        // сквозной тест проверка добавления, изменения, удаления контакта в блокноте из репозитория пользователя
        // через графический интерфейс пользователя, корректности отображаемого списка контактов
    }

}
