SELECT brand, model, quantity, booked_quantity
FROM car
WHERE model IN ('renault', 'opel', 'seat', 'skoda')
   OR quantity - booked_quantity < 10;