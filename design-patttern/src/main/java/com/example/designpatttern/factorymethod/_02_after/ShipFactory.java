package com.example.designpatttern.factorymethod._02_after;

public interface ShipFactory {
    default Ship orderShip(String name, String email){
        validate(name, email);
        prepareFor(name);
        Ship ship = createShip();
        sendEmailTo(email, ship);
        return ship;
    }

    private void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 다 만들었습니다.");
    }
    Ship createShip();
    //private이 아니기 때문에, 반드시 하위 클래스에서 만들어야 한다.

    private void validate(String name,String email ){
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("배 이름을 지어주세요.");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("연락처를 남겨주세요.");
        }

    }

    private static void prepareFor(String name) {
        System.out.println(name + " 만들 준비 중");
    }

}
