select "name", surname
from hibernate.persons
where lower(city_of_living) = lower(:city) ;
