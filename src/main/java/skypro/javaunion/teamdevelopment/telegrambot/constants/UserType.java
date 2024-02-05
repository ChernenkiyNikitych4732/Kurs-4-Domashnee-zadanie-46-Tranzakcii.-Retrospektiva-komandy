package skypro.javaunion.teamdevelopment.telegrambot.constants;

public enum UserType {

    DEFAULT("Пользователь"),
    GUEST("Гость"),
    ADOPTER("Усыновитель"),
    VOLUNTEER("Волонтерь");
    private final String translationType;

    UserType(String translationType) {
        this.translationType = translationType;
    }

    public String getTranslationType() {
        return translationType;
    }
}