package org.spacevatican.elasticsearchexample;

import org.elasticsearch.common.Nullable;
import org.elasticsearch.script.ExecutableScript;
import org.elasticsearch.script.NativeScriptFactory;

import org.spacevatican.elasticsearchexample.CustomScript;
import java.util.Map;

public class CustomScriptFactory implements NativeScriptFactory {
  
  @Override public ExecutableScript newScript(@Nullable Map<String,Object> params){
    return new CustomScript(params);
  }

}
