with tempTable(averageGrossed) as (select avg(grossed) from films),
     tempTable2(averageYearReleased) as (select avg(year_released) from films)
select films.title, films.genre, films.year_released, films.grossed
from films,
     tempTable,
     tempTable2
where films.grossed > tempTable.averageGrossed
  and films.year_released > tempTable2.averageYearReleased
group by  films.title,
films.genre,
films.year_released,
films.grossed;