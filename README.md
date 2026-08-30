<div align="center">

<img src="icon.svg" width="160" height="160" align="center" alt="BeeBoo Icon">

# BeeBoo

### Video/Audio Downloader for Android

English
&nbsp;&nbsp;|&nbsp;&nbsp;
<a href="translations/README-zh_Hans.md">简体中文</a>
&nbsp;&nbsp;|&nbsp;&nbsp;
<a href="translations/README-zh_Hant.md">繁體中文</a>
&nbsp;&nbsp;|&nbsp;&nbsp;
<a href="translations/README-ar.md">العربية</a>
&nbsp;&nbsp;|&nbsp;&nbsp;
<a href="translations/README-pt.md">Português</a>
&nbsp;&nbsp;|&nbsp;&nbsp;
<a href="translations/README-ua.md">Українська</a>
&nbsp;&nbsp;|&nbsp;&nbsp;
<a href="translations/README-th.md">ภาษาไทย</a>
&nbsp;&nbsp;|&nbsp;&nbsp;
<a href="translations/README-fa.md">فارسی</a>
&nbsp;&nbsp;|&nbsp;&nbsp;
<a href="translations/README-it.md">Italiano</a>
&nbsp;&nbsp;|&nbsp;&nbsp;
<a href="translations/README-az.md">Azərbaycanca</a>
&nbsp;&nbsp;|&nbsp;&nbsp;
<a href="translations/README-ru.md">Русский</a>
&nbsp;&nbsp;|&nbsp;&nbsp;
<a href="translations/README-sr.md">Српски</a>
&nbsp;&nbsp;|&nbsp;&nbsp;
<a href="translations/README-ja.md">日本語</a>
&nbsp;&nbsp;|&nbsp;&nbsp;
<a href="translations/README-id.md">Indonesia</a>
&nbsp;&nbsp;|&nbsp;&nbsp;
<a href="translations/README-hi.md">हिंदी</a>
&nbsp;&nbsp;|&nbsp;&nbsp;
<a href="translations/README-bn.md">বাংলা</a>

<br><br>

[![GitHub license](https://img.shields.io/github/license/ikrishanaa/Beeboo?style=flat-square)](LICENSE)
[![GitHub release](https://img.shields.io/github/v/release/ikrishanaa/Beeboo?color=black&label=Release&logo=github&style=flat-square)](https://github.com/ikrishanaa/Beeboo/releases)
[![Supported-Sites](https://img.shields.io/badge/Sites-9cf?style=flat-square&label=Supported%20Sites)](https://github.com/yt-dlp/yt-dlp/blob/master/supportedsites.md)
[![GitHub stars](https://img.shields.io/github/stars/ikrishanaa/Beeboo?style=flat-square&color=f8e444)](https://github.com/ikrishanaa/Beeboo/stargazers)

</div>

---

## 📱 Overview

**BeeBoo** is a modern, lightweight, and feature-rich video and audio downloader for Android, built with Jetpack Compose and powered by [yt-dlp](https://github.com/yt-dlp/yt-dlp). It is an actively maintained open-source fork designed to deliver a seamless download experience with updated dependencies and regular improvements.

---

## 📖 Features

- 📥 **Video & Audio Downloads**: Download video and audio streams from thousands of platforms supported by [yt-dlp](https://github.com/yt-dlp/yt-dlp).
- 🏷️ **Metadata & Thumbnails**: Embed metadata and album art into extracted audio files automatically using [mutagen](https://github.com/quodlibet/mutagen).
- 📑 **Playlist Downloads**: Download entire playlists with a single tap.
- ⚡ **Aria2 Acceleration**: Embedded [aria2c](https://github.com/aria2/aria2) multi-connection downloader for faster download speeds.
- 💬 **Subtitles Support**: Automatically extract and embed subtitles into downloaded videos.
- ⚙️ **Custom Commands**: Create, save, and execute custom yt-dlp command templates directly from the app.
- 🎨 **Material Design 3**: Modern UI with dynamic Material You colors and dark theme support.
- 🚀 **100% Kotlin & Jetpack Compose**: Pure Modern Android Development (MAD) architecture with composable destinations.

---

## 📱 Screenshots

<div align="center">
  <img src="fastlane/metadata/android/en-US/images/phoneScreenshots/1.jpg" width="30%" />
  <img src="fastlane/metadata/android/en-US/images/phoneScreenshots/2.jpg" width="30%" />
  <img src="fastlane/metadata/android/en-US/images/phoneScreenshots/3.jpg" width="30%" />
  <img src="fastlane/metadata/android/en-US/images/phoneScreenshots/4.jpg" width="30%" />
  <img src="fastlane/metadata/android/en-US/images/phoneScreenshots/5.jpg" width="30%" />
  <img src="fastlane/metadata/android/en-US/images/phoneScreenshots/6.jpg" width="30%" />
</div>

---

## 🛠️ Building from Source

### Prerequisites
- JDK 21
- Android SDK (API 35)

### Build Commands
```bash
# Clone the repository
git clone https://github.com/ikrishanaa/Beeboo.git
cd Beeboo

# Build Universal Debug APK
./gradlew assembleDebug

# Build Universal Release APK
./gradlew assembleGenericRelease
```

Compiled APK files will be generated under `app/build/outputs/apk/`.

---

## 🧱 Credits & Acknowledgements

BeeBoo is powered by:
- [yt-dlp](https://github.com/yt-dlp/yt-dlp) & [youtubedl-android](https://github.com/yausername/youtubedl-android)
- [aria2](https://github.com/aria2/aria2)
- [Read You](https://github.com/Ashinch/ReadYou) & [Music You](https://github.com/Kyant0/MusicYou)
- [Material color utilities](https://github.com/material-foundation/material-color-utilities)

---

## 📃 License

This project is licensed under the [GNU General Public License v3.0 (GPLv3)](LICENSE).
