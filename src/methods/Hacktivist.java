package methods;

public interface Hacktivist extends Hacker {
    default public String identifyMyself() {
        return "Man tarmoqni himaya qilaman.";
    }
}
