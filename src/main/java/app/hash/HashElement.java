package app.hash;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * Класс реализует элемент hesh таблицы
 *
 * @author vasil
 */
@AllArgsConstructor
@NoArgsConstructor
public class HashElement<K, V> implements HashElementInterface<K, V> {

    private K key;
    private V value;

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

}
