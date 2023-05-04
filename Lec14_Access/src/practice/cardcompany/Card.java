package practice.cardcompany;

public class Card {

    // TODO
    // 필요한 변수, 메소드, 생성자 정의하기
    private int cardNumber;

    public Card(int cardNumber) {
        this.cardNumber = cardNumber;
//        System.out.println(cardNumber);
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void getInfo(){
        System.out.println("나의 카드번호는 " + cardNumber + " 입니다");
    }
} // end class
