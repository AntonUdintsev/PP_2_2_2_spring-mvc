package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class CarDaoImpl implements CarDao{
    private static List<Car> cars= new ArrayList<>();

    {
        cars.add(new Car("model1","vendor1",001));
        cars.add(new Car("model2","vendor2",002));
        cars.add(new Car("model3","vendor3",003));
        cars.add(new Car("model4","vendor4",004));
        cars.add(new Car("model5","vendor5",005));
    }
    @Override
    public List<Car> getCars(Integer count) {
        if (count == null || count > 5) {
            return cars;
        } else {
            return cars.stream().limit(count).collect(Collectors.toList());
        }
    }
}
