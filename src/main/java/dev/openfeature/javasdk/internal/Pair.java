package dev.openfeature.javasdk.internal;

import lombok.Value;

@Value
public class Pair<K, V> {
    private K type;
    private V innerValue;
}
