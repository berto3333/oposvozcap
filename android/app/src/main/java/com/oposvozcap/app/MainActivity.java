import com.getcapacitor.community.speechrecognition.SpeechRecognition;

public class MainActivity extends BridgeActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.init(
            savedInstanceState,
            new ArrayList<Class<? extends Plugin>>() {{
                add(SpeechRecognition.class);
            }}
        );
    }
}