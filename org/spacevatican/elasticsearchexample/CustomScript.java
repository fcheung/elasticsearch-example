package org.spacevatican.elasticsearchexample;

import org.elasticsearch.common.Nullable;
import org.elasticsearch.script.ExecutableScript;
import org.elasticsearch.script.NativeScriptFactory;
import org.elasticsearch.script.AbstractDoubleSearchScript;
import java.util.Map;
import java.lang.Math;

public class CustomScript extends AbstractDoubleSearchScript {
  
    double base;
    double exp;

    public CustomScript(@Nullable Map<String,Object> params){
      base = ((Double)params.get("base")).doubleValue();
      exp = ((Double)params.get("exp")).doubleValue();
    }

    @Override
    public double runAsDouble() {
      double a = doc().numeric("a").getDoubleValue();
      
      return a / Math.pow(base, exp);
    }
}