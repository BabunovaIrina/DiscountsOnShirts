public class Shirts {

    public static void main(String[] args) {

        final int pricePerShirt = 3200;
        System.out.println("Цена одной рубашки без скидки - " + pricePerShirt);

        final int numberSelectedShirts = 3;
        System.out.println("Количество уже выбранных рубашек - " + numberSelectedShirts);

        final int numberShirtsForDiscount = 5;
        System.out.println("Количество рубашек, которые надо купить, чтобы получить скидку - " + numberShirtsForDiscount);

        final int numberShirtsNeededElseForDiscount = numberShirtsForDiscount - numberSelectedShirts;
        System.out.println("Количество рубашек, которые необходимо докупить для скидки - " + numberShirtsNeededElseForDiscount);

        final int totalPriceSelectedShirts = numberSelectedShirts * pricePerShirt;
        System.out.println("Общая цена выбранных рубашек без скидки - " + totalPriceSelectedShirts);

        final int totalPriceShirtsNeededElseForDiscount = numberShirtsNeededElseForDiscount * pricePerShirt;
        System.out.println("Общая цена рубашек, которые нужно докупить (без скидки) - " + totalPriceShirtsNeededElseForDiscount);

        final double percentDiscount = 0.35;
        System.out.println("Процент скидки - " + percentDiscount);
        /**
         * в качестве "всех рубашек со скидкой" взяла количество необходимых рубашек для получения скидки.
         */
        final double discountPricePerShirt = pricePerShirt - pricePerShirt * percentDiscount;
        System.out.println("Цена одной рубашки со скидкой - " + discountPricePerShirt);

        final double totalDiscountPriceShirts = discountPricePerShirt * numberShirtsForDiscount;
        System.out.println("Общая стоимость необходимых рубашек со скидкой - " + totalDiscountPriceShirts);

        final double amountMoneySaved = numberShirtsForDiscount * pricePerShirt - totalDiscountPriceShirts;
        System.out.println("Сэкономили - " + amountMoneySaved + " денег");
        /**
         * рубашка бесплатно = цена рубашки с учетом скидки
         */
        //final double countBonusShirts = amountMoneySaved / discountPricePerShirt;
        final int countBonusShirts = (int) (amountMoneySaved / discountPricePerShirt);
        System.out.println("Количество рубашек, которые достались бесплатно - " + countBonusShirts + " шт");
    }
}
