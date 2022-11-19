package Interfaces;

public class Main {
    public static void main(String[] args) {
        ITelephone timsPhone;

        timsPhone = new DeskPhone(123456);  //Cant instantiated with ITelephone, because it is am interface
        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();

        timsPhone = new MobilePhone(24565);
        timsPhone.callPhone(24565);
        timsPhone.answer();

    }
}
