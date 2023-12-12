package ng.edu.binghamuni.inventoryapplication.repository;

import ng.edu.binghamuni.inventoryapplication.domain.Drink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//public class DrinkRepository {
//}
//public  interface ;

@Repository
public interface DrinkRepository extends JpaRepository<Drink,Long> {
//    @Query("")
//    List<Drink> findDrinkByPriceGreaterThan(int price);
}
