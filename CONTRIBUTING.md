# Contributing

Before reading, you may know what [yt-dlp](https://github.com/yt-dlp/yt-dlp) is and what it does. In short, it's a CLI (Command Line Interface) program written in Python, which lets you download videos from [1000+ websites](https://github.com/yt-dlp/yt-dlp/blob/master/supportedsites.md).

For bug reports and feature requests, please search in issues first (including closed ones). If there are no duplicates, feel free to [submit an issue](https://github.com/ikrishanaa/Beeboo/issues/new).

## Bug Report

When submitting a bug report, please make sure your issue contains **enough** information for reproducing the problem, including the options or the custom command being used, the link to the video, and device/OS specifications.

## Feature Request

BeeBoo is a GUI for yt-dlp, providing the rich functionality of yt-dlp with a modern Material You interface.

The app provides two primary download modes:
- **General mode**: Save as audio, download playlists, select formats, and customize configurations for download tasks. Once complete, BeeBoo scans the files into the system media library and keeps download history.
- **Custom command mode**: Advanced usage allowing users to create, store, and execute custom yt-dlp command templates directly.

## Pull Request

If you wish to contribute to the project by submitting code directly, please first open an issue describing the changes you plan to make.

## Building From Source

Fork or clone this project, import and compile it with the latest Android Studio or via Gradle:

```bash
./gradlew assembleDebug
```
