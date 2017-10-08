package duong;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Message;

/**
 * Created by d on 10/3/2017.
 */

public class Task extends AsyncTask<Void, Void, Void> {
    Handler handler;
    Context context;

    public Task(Handler handler, Context context) {
        this.handler = handler;
        this.context = context;
    }

    @Override
    protected Void doInBackground(Void... voids) {
        return null;

    }

    @Override
    protected void onPostExecute(Void aVoid) {
        Message message = new Message();
        handler.sendMessage(message);
    }
}

/*
     new Thread() {
            @Override
            public void run() {

            }
        }.start();
 */
class TaskVoid extends AsyncTask<Void, Void, Void> {
    public TaskVoid(Handler handler) {
        this.handler = handler;

    }

    Handler handler;

    @Override
    protected Void doInBackground(Void... voids) {
        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        Message message = new Message();
        handler.sendMessage(message);
    }
}

