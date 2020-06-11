package io.dama.ffi.lambda;

import java.util.ArrayList;
import java.util.List;

public class TransformPerformer {
    public static <T> ArrayList<T> perform(List<T> l, Transformer<T> t) {
        var result = new ArrayList<T>();
        for (var e : l) {
            result.add(t.transform(e));
        }
        return result;
    }
}
