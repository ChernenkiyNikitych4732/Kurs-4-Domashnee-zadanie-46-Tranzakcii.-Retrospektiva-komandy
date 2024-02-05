package skypro.javaunion.teamdevelopment.telegrambot.exception;

/**
 * Ошибка при отсутствии отчетов у волонтера.
 */
public class NotFoundReportException extends RuntimeException{

    public NotFoundReportException(String message) {
        super("Отчетов нет!");
    }
}