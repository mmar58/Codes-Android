//import
import android.text.TextWatcher;
import android.text.Editable;

//void
addTextChangedListener(new TextWatcher() {

          public void afterTextChanged(Editable s) {

          }

          public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

          public void onTextChanged(CharSequence s, int start, int before, int count) {}
       });
	 
	   
	   
import android.widget.TextView.OnEditorActionListener;
import android.view.inputmethod.EditorInfo;
import android.view.KeyEvent;
//xml
android:imeOptions="actionSend"

// to run function on send key
setOnEditorActionListener(new OnEditorActionListener() {
    @Override
    public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
        boolean handled = false;
        if (actionId == EditorInfo.IME_ACTION_SEND) {
            sendMessage();
            handled = true;
        }
        return handled;
    }
});
