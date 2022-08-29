package Chapter12.enums;

public enum Season {
//    WINTER,
//    SPRING,
//    SUMMER,
//    FALL
    WINTER("Low"),
    SPRING("Medium"),
    SUMMER("High"),
    FALL("Medium");

    private final String expectedVisitors;
    Season(String expectedVisitors){
        this.expectedVisitors = expectedVisitors;
    }

    public void printExpectedVisitors(){
        System.out.println(expectedVisitors);
    }

}
