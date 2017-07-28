package com.londonappbrewery.destini;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;
import static com.londonappbrewery.destini.R.id.buttonBottom;
import static com.londonappbrewery.destini.R.id.buttonTop;
import static com.londonappbrewery.destini.R.id.storyTextView;
import static com.londonappbrewery.destini.R.string.T3_Ans1;
import static com.londonappbrewery.destini.R.string.T3_Ans2;
import static com.londonappbrewery.destini.R.string.T3_Story;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

        Button mbuttonTop;
        Button mbuttonBottom;
        TextView mstoryTextView;
        int mstoryindex;


    @Override
    public View findViewById(@IdRes int id) {
        return super.findViewById(id);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mstoryindex = 1;









        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mbuttonTop = (Button) findViewById(buttonTop);
        mbuttonBottom = (Button) findViewById(buttonBottom);
        mstoryTextView = (TextView) findViewById(storyTextView);






            // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mbuttonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mstoryTextView.setText(R.string.T3_Story);
                mbuttonTop.setText(R.string.T3_Ans1);
                mbuttonBottom.setText(R.string.T3_Ans2);
                    mbuttonTop.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            mstoryTextView.setText(R.string.T6_End);
                                mbuttonBottom.setVisibility(View.GONE);
                                mbuttonTop.setVisibility(View.GONE);

                        }
                    });

                    mbuttonBottom.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            mstoryTextView.setText(R.string.T5_End);
                            mbuttonBottom.setVisibility(View.GONE);
                            mbuttonTop.setVisibility(View.GONE);
                        }
                    });




            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        mbuttonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mstoryTextView.setText(R.string.T2_Story);
                mbuttonTop.setText(R.string.T2_Ans1);
                mbuttonBottom.setText(R.string.T2_Ans2);
                    mbuttonTop.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            mstoryTextView.setText(R.string.T3_Story);
                            mbuttonTop.setText(R.string.T3_Ans1);
                            mbuttonBottom.setText(R.string.T3_Ans2);
                            mbuttonTop.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    mstoryTextView.setText(R.string.T6_End);
                                    mbuttonBottom.setVisibility(View.GONE);
                                    mbuttonTop.setVisibility(View.GONE);

                                }
                            });

                            mbuttonBottom.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    mstoryTextView.setText(R.string.T5_End);
                                    mbuttonBottom.setVisibility(View.GONE);
                                    mbuttonTop.setVisibility(View.GONE);
                                }
                            });


                        }
                    });
                    mbuttonBottom.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            mstoryTextView.setText(R.string.T4_End);
                            mbuttonBottom.setVisibility(View.GONE);
                            mbuttonTop.setVisibility(View.GONE);

                        }
                    });




            }
        });



    }
}
