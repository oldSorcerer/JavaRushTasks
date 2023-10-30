select number, round(inventory + (inventory * 0.01)) as with_spare_parts
from lego_set;