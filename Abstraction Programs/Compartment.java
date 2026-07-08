package AbstractClass;

import java.util.Random;

abstract class Compartment {
    public abstract String notice();
}

class FirstClass extends Compartment {
    public String notice() {
        return "First Class: Luxury coach. Please maintain silence.";
    }
}

class Ladies extends Compartment {
    public String notice() {
        return "Ladies Compartment: Reserved for ladies only.";
    }
}

class General extends Compartment {
    public String notice() {
        return "General Compartment: Please travel safely.";
    }
}

class Luggage extends Compartment {
    public String notice() {
        return "Luggage Compartment: Goods only. Passengers not allowed.";
    }
}

