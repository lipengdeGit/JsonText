package jihe.ziyuan.android.jsontext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class MainActivity extends AppCompatActivity {

    String json ="{\"a\":\"100\",\"b\":[{\"b1\":\"b_value1\",\"b2\":\"b_value2\"},{\"b1\":\"b_value1\",\"b2\":\"b_value2\"}]，\"c\":{\"c1\":\"c_value1\",\"c2\":\"c_value2\"}}";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson = new Gson();
//        java.lang.reflect.Type type = new TypeToken<JsonBean>() {}.getType();
//        JsonBean jsonBean = gson.fromJson(json, type);
          JsonBean jsonBean=gson.fromJson(json,JsonBean.class);
    }
}
