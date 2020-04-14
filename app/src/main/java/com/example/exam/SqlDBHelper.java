package com.example.exam;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.exam.Admin.AdminConstract;
import com.example.exam.Chapter.ChapterContract;
import com.example.exam.Department.DepartmentContract;
import com.example.exam.Exam.ExamContract;
import com.example.exam.Faculity.FaculityContract;
import com.example.exam.Level.LevelContract;
import com.example.exam.Professor.ProfessorContract;
import com.example.exam.Question.QuestionContract;
import com.example.exam.Score.ScoreContract;
import com.example.exam.Student.StudentContract;
import com.example.exam.Subject.SubjectContract;


import static com.example.exam.University.University_contract.UniversityTable.COLUMN_UNIVERSITY_ID;
import static com.example.exam.University.University_contract.UniversityTable.COLUMN_UNIVERSITY_NAME;
import static com.example.exam.University.University_contract.UniversityTable.TABLE_UNIVERSITY;



public class SqlDBHelper extends SQLiteOpenHelper {
    public  static  final  String DATABASE_NAME="e-exam.db";
    public  static  final  int DATABASE_VERSION=2;
    private SQLiteDatabase db;
    public SqlDBHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        this.db=db;
        final String SQL_UNIVERSITY_TABLE = "create table " +
                TABLE_UNIVERSITY + " ( " +
                COLUMN_UNIVERSITY_ID + "   INTEGER PRIMARY KEY AUTOINCREMENT, " +

                COLUMN_UNIVERSITY_NAME + "  TEXT" +
                ")";


        db.execSQL(SQL_UNIVERSITY_TABLE);


        final String SQL_FACULITY_TABLE = "create table "
                + FaculityContract.FaculityTable.TABLE_FACULITY + " ("
                + FaculityContract.FaculityTable.COLUMN_FACULITY_ID + " integer primary key autoincrement, "
                + FaculityContract.FaculityTable.COLUMN_FACULITY_NAME + " text not null, "
                + FaculityContract.FaculityTable.COLUMN_UNIVERSITY_FACULITY_NAME + " text not null, "


                + FaculityContract.FaculityTable.COLUMN_UNIVERSITY_FACULITY_ID + " integer,"
                + " FOREIGN KEY ("+ COLUMN_UNIVERSITY_ID +") REFERENCES "+ TABLE_UNIVERSITY +"("+COLUMN_UNIVERSITY_ID+"));";

                db.execSQL(SQL_FACULITY_TABLE);

        final String SQL_ADMIN_TABLE = "create table "
                + AdminConstract.AdminTable.TABLE_ADMIN + " ("
                + AdminConstract.AdminTable.COLUMN_ADMIN_ID + " integer primary key autoincrement, "
                + AdminConstract.AdminTable.COLUMN_ADMIN_NAME + " text not null, "
                + AdminConstract.AdminTable.COLUMN_ADMIN_EMAIL + " text not null, "
                + AdminConstract.AdminTable.COLUMN_ADMIN_PASSWORD + " text not null "+
                " )";
                  db.execSQL(SQL_ADMIN_TABLE);



        final String SQL_level_TABLE = "create table "
                + LevelContract.LevelTable.LEVEL_TABLE + " ("
                + LevelContract.LevelTable.COLUMN_LEVEL_ID + " integer primary key autoincrement, "
                + LevelContract.LevelTable.COLUMN_LEVEL_NAME + " text not null, "



                + LevelContract.LevelTable.COLUMN_LEVEL_FACULITY_ID + " integer,"
                + " FOREIGN KEY ("+ FaculityContract.FaculityTable.COLUMN_FACULITY_ID +") REFERENCES "+ FaculityContract.FaculityTable.TABLE_FACULITY +"("+ FaculityContract.FaculityTable.COLUMN_FACULITY_ID +"));";
          db.execSQL(SQL_level_TABLE);




        final String SQL_DEPARTMENT_TABLE = "create table "
                + DepartmentContract.DepartmentTable .DEPARTMENT_TABLE + " ("
                + DepartmentContract.DepartmentTable.COLUMN_DEPARTMENT_ID + " integer primary key autoincrement, "
                + DepartmentContract.DepartmentTable.COLUMN_DEPARTMENT_NAME + " text not null " +
                " )";
        db.execSQL(SQL_DEPARTMENT_TABLE);
        final String SQL_PROFESSOR_TABLE = "create table "
                + ProfessorContract.ProfessorTable.TABLE_PROFESSOR + " ("
                + ProfessorContract.ProfessorTable.COLUMN_PROFESSOR_ID + " integer primary key autoincrement, "
                + ProfessorContract.ProfessorTable.COLUMN_PROFESSOR_NAME + " text not null, "
                + ProfessorContract.ProfessorTable.COLUMN_PROFESSOR_EMAIL + " text not null, "
                + ProfessorContract.ProfessorTable.COLUMN_PROFESSOR_PASSWORD + " text not null, "

                + ProfessorContract.ProfessorTable.COLUMN_PROFESSOR_UNIVERSITY_ID + " integer,"
                + " FOREIGN KEY ("+ COLUMN_UNIVERSITY_ID +") REFERENCES "+ TABLE_UNIVERSITY +"("+ COLUMN_UNIVERSITY_ID +")" +



                ")";
        db.execSQL(SQL_PROFESSOR_TABLE);


        final String SQL_question_TABLE = "create table "
                + QuestionContract.QuestionTable.TABLE_QUESTION_NAME + " ("
                + QuestionContract.QuestionTable.COLUMN_QUESTION_ID + " integer primary key autoincrement, "
                + QuestionContract.QuestionTable.COLUMN_QUESTION_NAME + " text not null, "
                + QuestionContract.QuestionTable.COLUMN_QUESTION_TYPE + " text not null, "
                + QuestionContract.QuestionTable.COLUMN_OPTION1 + " text not null, "
                + QuestionContract.QuestionTable.COLUMN_OPTION2 + " text not null, "
                + QuestionContract.QuestionTable.COLUMN_OPTION3 + " text not null, "
                + QuestionContract.QuestionTable.COLUMN_OPTION4 + " text not null, "
                + QuestionContract.QuestionTable.COLUMN_QUESTION_DIFFICULITY + " text not null, "
                + QuestionContract.QuestionTable.COLUMN_ANSWER + " INTEGER "+
                " )";
        db.execSQL(SQL_question_TABLE);
        final String SQL_SCORE_TABLE = "create table "
                + ScoreContract.ScoreTable.TABLE_SCORE + " ("
                + ScoreContract.ScoreTable.COLUMN_SCORE_ID + " integer primary key autoincrement, "
                + ProfessorContract.ProfessorTable.COLUMN_PROFESSOR_NAME + " text not null, "
                + ScoreContract.ScoreTable.COLUMN_SCORE + " INTEGER, "

                + ScoreContract.ScoreTable.COLUMN_SCORE_QUESTION_ID + " integer,"
                + " FOREIGN KEY ("+ QuestionContract.QuestionTable.COLUMN_QUESTION_ID +") REFERENCES "+ QuestionContract.QuestionTable.TABLE_QUESTION_NAME +"("+ QuestionContract.QuestionTable.COLUMN_QUESTION_ID +")" +
                " )";
          db.execSQL(SQL_SCORE_TABLE);
        final String SQL_STUDENT_TABLE = "create table "
                + StudentContract.StudentTable.TABLE_STUDENT_NAME + " ("
                + StudentContract.StudentTable.COLUMN_STUDENT_ID + " integer primary key autoincrement, "
                + StudentContract.StudentTable.COLUMN_STUDENT_NAME + " text not null, "
                + StudentContract.StudentTable.COLUMN_STUDENT_EMAIL + " text not null, "
                + StudentContract.StudentTable.COLUMN_STUDENT_PASSWORD + " text not null, "

                +StudentContract.StudentTable.COLUMN_FACULITY_STUDENT_ID + " INTEGER, "
                +StudentContract.StudentTable.COLUMN_department_STUDENT_ID + " INTEGER, "
                + StudentContract.StudentTable.COLUMN_UNIVERSITY_STUDENT_ID + " integer,"
                + " FOREIGN KEY ("+ COLUMN_UNIVERSITY_ID +") REFERENCES "+ TABLE_UNIVERSITY +"("+ COLUMN_UNIVERSITY_ID +")" +



                " )";
        db.execSQL(SQL_STUDENT_TABLE);
        final String SQL_SUBJECT_TABLE = "create table "
                + SubjectContract.SubjectTable.TABLE_SUBJECT_NAME + " ("
                + SubjectContract.SubjectTable.COLUMN_SUBJECT_ID + " integer primary key autoincrement, "
                + SubjectContract.SubjectTable.COLUMN_SUBJECT_NAME + " text not null, "


                + SubjectContract.SubjectTable.COLUMN_SUBJECT_LEVEL_ID + " INTEGER, "
                + SubjectContract.SubjectTable.COLUMN_SUBJECT_PROFESSOR_ID + " INTEGER, "

                + SubjectContract.SubjectTable.COLUMN_SUBJECT_DEPARTMENT_ID + " integer,"
                + " FOREIGN KEY ("+ DepartmentContract.DepartmentTable.COLUMN_DEPARTMENT_ID +") REFERENCES "+ DepartmentContract.DepartmentTable.DEPARTMENT_TABLE +"("+ DepartmentContract.DepartmentTable.COLUMN_DEPARTMENT_ID +")" +



                " )";
        db.execSQL(SQL_SUBJECT_TABLE);
        final String SQL_CHAPTER_TABLE = "create table "
                + ChapterContract.ChapterTable.TABLE_CHAPTER_NAME + " ("
                + ChapterContract.ChapterTable.COLUMN_CHAPTER_ID + " integer primary key autoincrement, "
                + ChapterContract.ChapterTable.COLUMN_CHAPTER_NAME + " text not null, "



                + ChapterContract.ChapterTable.COLUMN_CHAPTER_SUBJECT_ID + " integer,"
                + " FOREIGN KEY ("+ SubjectContract.SubjectTable.COLUMN_SUBJECT_ID +") REFERENCES "+ SubjectContract.SubjectTable.TABLE_SUBJECT_NAME +"("+ SubjectContract.SubjectTable.COLUMN_SUBJECT_ID +"));";
        db.execSQL(SQL_CHAPTER_TABLE);
        final String SQL_EXAM_TABLE = "create table "
                + ExamContract.ExamTable.TABLE_EXAM_NAME + " ("
                + ExamContract.ExamTable.COLUMN_EXAM_ID + " integer primary key autoincrement, "
                + ExamContract.ExamTable.COLUMN_EXAM_subject_ID + " INTEGER, "
                + ExamContract.ExamTable.COLUMN_EXAM_PROFESSOR_ID+ " INTEGER, "
                + ExamContract.ExamTable.COLUMN_EXAM_TIME + " FLOAT, "


                 + ExamContract.ExamTable.COLUMN_EXAM_Question_ID+ " INTEGER, "
                + " FOREIGN KEY ("+ QuestionContract.QuestionTable.COLUMN_QUESTION_ID +") REFERENCES "+ QuestionContract.QuestionTable.TABLE_QUESTION_NAME +"("+ QuestionContract.QuestionTable.COLUMN_QUESTION_ID +"));";
        db.execSQL(SQL_EXAM_TABLE);



    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_UNIVERSITY);
        onCreate(db);

        db.execSQL("DROP TABLE IF EXISTS "+ FaculityContract.FaculityTable.TABLE_FACULITY);
        onCreate(db);

        db.execSQL("DROP TABLE IF EXISTS "+ AdminConstract.AdminTable.TABLE_ADMIN);
        onCreate(db);
        db.execSQL("DROP TABLE IF EXISTS "+ LevelContract.LevelTable.LEVEL_TABLE);
        onCreate(db);
        db.execSQL("DROP TABLE IF EXISTS "+ DepartmentContract.DepartmentTable.DEPARTMENT_TABLE);
        onCreate(db);
        db.execSQL("DROP TABLE IF EXISTS "+ ProfessorContract.ProfessorTable.TABLE_PROFESSOR);
        onCreate(db);
        db.execSQL("DROP TABLE IF EXISTS "+ QuestionContract.QuestionTable.TABLE_QUESTION_NAME);
        onCreate(db);
        db.execSQL("DROP TABLE IF EXISTS "+ ScoreContract.ScoreTable.TABLE_SCORE);
        onCreate(db);
        db.execSQL("DROP TABLE IF EXISTS "+ StudentContract.StudentTable.TABLE_STUDENT_NAME);
        onCreate(db);
        db.execSQL("DROP TABLE IF EXISTS "+ SubjectContract.SubjectTable.TABLE_SUBJECT_NAME);
        onCreate(db);
        db.execSQL("DROP TABLE IF EXISTS "+ ChapterContract.ChapterTable.TABLE_CHAPTER_NAME);
        onCreate(db);
        db.execSQL("DROP TABLE IF EXISTS "+ ExamContract.ExamTable.TABLE_EXAM_NAME);
        onCreate(db);






    }
}
