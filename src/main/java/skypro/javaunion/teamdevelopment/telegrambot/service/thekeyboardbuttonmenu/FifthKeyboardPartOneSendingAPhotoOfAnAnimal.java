package skypro.javaunion.teamdevelopment.telegrambot.service.thekeyboardbuttonmenu;

import skypro.javaunion.teamdevelopment.telegrambot.theenumconstants.Animals;

import java.util.ArrayList;
import java.util.List;

public class FifthKeyboardPartOneSendingAPhotoOfAnAnimal {
    public static List<String> getList(Animals enumAnimals) {
        List<String> list = new ArrayList<>();
        list.add("Нажмите кнопку, подтверждения загрузки фото !");
        list.add("/upload photo" + enumAnimals.getTitle());
        return list;
    }
}