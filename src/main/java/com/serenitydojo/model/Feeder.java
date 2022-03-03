package com.serenitydojo.model;

public class Feeder {
    public FoodType feeds(AnimalType animal, boolean isPremium) {
<<<<<<< HEAD

=======
//        if (animal.equals(("Cat"))) {
////            if (isPremium) {
////                return "Salmon";
////            } else {
////            return "Tuna";}
//            return (isPremium) ? "Salmon" : "Tuna";
//        } else if (animal.equals("Dog")){
//            return (isPremium) ? "Deluxe Dog Food" : "Dog Food";
//        }
//        else {
//            return (isPremium) ? "Lettuce" : "Cabbage";
//        }
>>>>>>> master
        switch (animal) {
            case CAT:
                return (isPremium) ? FoodType.SALMON : FoodType.TUNA;
            case DOG:
<<<<<<< HEAD
                return  (isPremium) ? FoodType.DELUXE_DOG_FOOD : FoodType.DOG_FOOD;
            case HAMSTER:
                return (isPremium) ? FoodType.LETTUCE : FoodType.CABBAGE;
            default:
                return  FoodType.UNKNOWN;
=======
                return (isPremium) ? FoodType.DELUXE_DOG_FOOD : FoodType.DOG_FOOD;
            case HAMSTER:
                return (isPremium) ?FoodType.LETTUCE : FoodType.CABBAGE;
            default:
                return FoodType.UNKNOWN;



>>>>>>> master
        }
    }
}
