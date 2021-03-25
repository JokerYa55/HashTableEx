package app.hash;

/**
 * Класс hesh таблицы
 *
 * @author vasil
 */
public class HashTableEx<K, V> {

    private final int hashSize;
    private final HashTableArrElement[] array;

    public HashTableEx(int hashSize) {
        this.hashSize = hashSize;
        this.array = new HashTableArrElement[hashSize];
        for (int i = 0; i < this.array.length; i++) {
            this.array[i] = new HashTableArrElement();
        }
    }

    public void put(K key, V value) {
        HashElement<K, V> item = new HashElement(key, value);
        // Вычисляем hash
        int index = getValueHash(key);
        this.array[index].getElementList().add(item);
    }

    public V get(K key) {
        int index = getValueHash(key);
        HashElementInterface res = this.array[index].getElementList().stream().filter(t -> t.getKey().equals(key)).findFirst().get();
        return (V) res.getValue();
    }

    private int getValueHash(K key) {
        int sum = 0;
        byte[] buf = key.toString().getBytes();
        for (int i = 0; i < buf.length; i++) {
            sum = sum + buf[i];
        }
        return sum % this.hashSize;
    }

}
