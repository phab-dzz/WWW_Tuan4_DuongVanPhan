package constants;

import models.Skill;

public enum DifferentLevel {
    ONE("1"),TWO("2"),THREE("3"),FOUR("4"),FIVE("5");

    private String level;

    private DifferentLevel(String level) {
        this.level = level;
    }
    public static DifferentLevel getSkillLevel(String level){
        return switch (level){
            case "1" -> DifferentLevel.ONE;
           case "2" -> DifferentLevel.TWO;
           case "3" -> DifferentLevel.THREE;
           case "4" -> DifferentLevel.FOUR;
           case "5" -> DifferentLevel.FIVE;

            default -> DifferentLevel.ONE;
        };
    }

}
