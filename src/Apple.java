public class Apple {
    public int weight = 10;

    public void dropdown(){
        System.out.println("Quả táo rơi xuống đất");
    }
    public boolean isEmpty() {
        if (this.weight < 1) {
            return true;
        }
        return false;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight() {
        this.weight = this.weight - 1;
    }


}
