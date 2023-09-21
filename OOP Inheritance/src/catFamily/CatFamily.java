package catFamily;

public class CatFamily {
    protected int legs;
    protected int eyes;
    protected boolean canEatAPerson;


    public CatFamily(int legs, int eyes, boolean canEatAPerson) {
        this.legs = legs;
        this.eyes = eyes;
        this.canEatAPerson = canEatAPerson;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
    public void setEyes(int eyes) {
        this.eyes = eyes;
    }
    public void setCanEatAPerson(boolean canEatAPerson) {
        this.canEatAPerson = canEatAPerson;
    }

    public int getLegs() {
        return legs;
    }
    public int getEyes() {
        return eyes;
    }
    public boolean isCanEatAPerson() {
        return canEatAPerson;
    }



    public void eat(){
        System.out.print("i eat ");
    }
}
