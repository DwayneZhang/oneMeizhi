package com.example.dwayne.onemeizhi.base;

import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.example.dwayne.onemeizhi.DwayneFactory;
import com.example.dwayne.onemeizhi.GankApi;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by Dwayne on 2017/11/12.
 */

public class BaseActivity extends AppCompatActivity {
        public static final GankApi sGankIO = DwayneFactory.getsGankIOSingleton();
        private CompositeSubscription mCompositeSubscription;

        public CompositeSubscription getmCompositeSubscription() {
                if(this.mCompositeSubscription == null) {
                        this.mCompositeSubscription = new CompositeSubscription();
                }
                return this.mCompositeSubscription;
        }

        public void addSubscription(Subscription s) {
                if(this.mCompositeSubscription == null) {
                        this.mCompositeSubscription = new CompositeSubscription();
                }
                this.mCompositeSubscription.add(s);
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
//                int id = item.getItemId();
//                switch (id) {
//                }
                return super.onOptionsItemSelected(item);
        }

        @Override
        protected void onDestroy() {
                super.onDestroy();
                if(this.mCompositeSubscription != null) {
                        this.mCompositeSubscription.unsubscribe();
                }
        }
}
