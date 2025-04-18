
# The Quiz App

A simple Android application that displays a list of quiz questions fetched from a **local PHP API**. The app follows the **MVVM architecture** and uses **Retrofit** for network calls.

## Features

- Fetches quiz questions from a local backend (PHP + JSON)
- Uses Retrofit for API communication
- Clean MVVM structure
- Separates concerns using Repository and ViewModel patterns

## Architecture

The project is structured as follows:

```
app/
â””â”€â”€ src/
    â””â”€â”€ main/
        â””â”€â”€ java/
            â””â”€â”€ ir/
                â””â”€â”€ hajkarami/
                    â””â”€â”€ thequizapp/
                        â”œâ”€â”€ api/
                        â”‚   â”œâ”€â”€ RetrofitInstance.java
                        â”‚   â””â”€â”€ QuestionsAPI.java
                        â”œâ”€â”€ model/
                        â”œâ”€â”€ repository/
                        â”œâ”€â”€ viewmodel/
                        â”œâ”€â”€ MainActivity.java
                        â””â”€â”€ ResultsActivity.java
```

## API

The app connects to a local server using this base URL:

```
http://10.0.2.2/quiz/
```

And fetches quiz data from this endpoint:

```
http://10.0.2.2/quiz/myquizapi.php
```

**Note**: `10.0.2.2` is used to access `localhost` from the Android emulator. You must run a local server (e.g., XAMPP) on your PC and place the `myquizapi.php` file and quiz data there.

You can replace the base URL in `RetrofitInstance.java` to connect to a remote server later.

## Libraries Used

- Retrofit 2
- Gson Converter
- AndroidX ViewModel & LiveData

## How to Run

1. Clone the project
2. Make sure your local PHP server is running and accessible at `http://10.0.2.2/quiz/myquizapi.php`
3. Open the project in Android Studio
4. Build and run the app using the emulator

## License

MIT License
