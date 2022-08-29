package Chapter8;

class Duck  {
    private String color;
    private int height;
    private int length;
    public void setData(int lenght, int theHeight){
        length = this.length; // backwards - no good
        height = theHeight;
        this.color = "white";
    }

    public static void main(String[] args) {
        Duck b = new Duck();
        b.setData(1,2);
        System.out.println(b.length + " " + b.height + " " + b.color);  // 0 2 white
    }
}



