package ai.elimu.storybooks;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

//import ai.elimu.analytics.eventtracker.EventTracker;
//import ai.elimu.contentprovider.ContentProvider;
//import ai.elimu.contentprovider.model.content.StoryBook;
//import ai.elimu.contentprovider.util.MultimediaHelper;
//import ai.elimu.model.enums.GradeLevel;

import java.io.File;
import java.util.List;

public class StoryBooksActivity extends AppCompatActivity {

    private GridLayout storyBooksGridLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(getClass().getName(), "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storybooks);

        storyBooksGridLayout = (GridLayout) findViewById(R.id.storyBookGridLayout);

//        List<StoryBook> storyBooks = ContentProvider.getAllStoryBooks(GradeLevel.LEVEL1);
//        Log.i(getClass().getName(), "storyBooks.size(): " + storyBooks.size());
//
//        for (final StoryBook storyBook : storyBooks) {
//            View storyBookView = LayoutInflater.from(this).inflate(R.layout.activity_storybooks_cover_view, storyBooksGridLayout, false);
//
//            File storyBookCoverFile = MultimediaHelper.getFile(storyBook.getCoverImage());
//            Log.i(getClass().getName(), "storyBookCoverFile: " + storyBookCoverFile);
//            if (storyBookCoverFile.exists()) {
//                ImageView storyBookImageView = (ImageView) storyBookView.findViewById(R.id.storyBookCoverImageView);
//                Bitmap bitmap = BitmapFactory.decodeFile(storyBookCoverFile.getAbsolutePath());
//                storyBookImageView.setImageBitmap(bitmap);
//            }
//
//            TextView storyBookCoverTitleTextView = (TextView) storyBookView.findViewById(R.id.storyBookCoverTitleTextView);
//            storyBookCoverTitleTextView.setText(storyBook.getTitle());
//
//            storyBookView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Log.i(getClass().getName(), "onClick");
//
//                    Log.i(getClass().getName(), "storyBook.getId(): " + storyBook.getId());
//                    Log.i(getClass().getName(), "storyBook.getTitle(): " + storyBook.getTitle());
//
//                    EventTracker.reportStoryBookLearningEvent(getApplicationContext(), storyBook.getId());
//
////                    Intent intent = new Intent(getApplicationContext(), StoryBookActivity.class);
//                    Intent intent = new Intent(getApplicationContext(), TabbedActivity.class);
//                    intent.putExtra(TabbedActivity.EXTRA_KEY_STORYBOOK_ID, storyBook.getId());
//                    startActivity(intent);
//                }
//            });
//
//            storyBooksGridLayout.addView(storyBookView);
//        }
    }

    @Override
    protected void onStart() {
        Log.i(getClass().getName(), "onStart");
        super.onStart();
    }
}
