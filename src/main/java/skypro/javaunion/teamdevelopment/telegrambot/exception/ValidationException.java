package skypro.javaunion.teamdevelopment.telegrambot.exception;


/**
 * Ошибка валидации.
 */
public class ValidationException extends RuntimeException{

    public ValidationException(String message) {
        super("Ошибка валидации!");
    }
}