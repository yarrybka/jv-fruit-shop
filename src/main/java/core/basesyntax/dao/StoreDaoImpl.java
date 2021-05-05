package core.basesyntax.dao;

import core.basesyntax.db.Storage;
import core.basesyntax.model.Fruit;
import java.util.Map;
import java.util.Optional;

public class StoreDaoImpl implements StoreDao {
    @Override
    public void add(Fruit fruit, int newQuantity) {
        Storage.addFruit(fruit, newQuantity);
    }

    @Override
    public int get(Fruit fruit) {
        return Optional.ofNullable(Storage.getFruits().get(fruit)).orElse(0);
    }

    @Override
    public Map<Fruit, Integer> getAll() {
        return Storage.getFruits();
    }
}
