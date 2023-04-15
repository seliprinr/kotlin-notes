package anonymous;

public class Programa {

    public void calculo(Bonus bonus) {
        bonus.calcula()
    }

    public static void main(String[] args) {
        Programa p = new Programa();
        p.calculo(new Bonus() {
            @Override
            public Float calcula() {
                return 500f;
            }
        });
    }

}
