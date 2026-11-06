# Dovera

**Dovera** is an independent Android messaging application.

## Build Android

Requirements: JDK 17, Android SDK 35, Android NDK 23.1.7779620.

From `apps/multiplatform`:

```bash
./gradlew --no-daemon :android:assembleFossDebug
```

The debug APKs are generated in:

```
apps/multiplatform/android/build/outputs/apk/foss/debug/
```

The repository includes GitHub Actions workflows for Android debug builds and signed FOSS releases. A signed release requires the repository secrets `DOVERA_KEYSTORE_BASE64` and `DOVERA_KEYSTORE_PASSWORD`.

## License and notices

The application source is distributed under **GNU AGPLv3**; see [LICENSE](LICENSE). Third-party components retain their respective licenses and copyright notices; see the notices distributed with those components.

*Origin notice: Dovera is an independently maintained derivative of the open-source SimpleX Chat codebase. It is not the official SimpleX Chat application; upstream names and marks are not part of Dovera's branding.*

---

# دوڤيرا

**Dovera** تطبيق مراسلة مستقل لنظام Android.

## بناء التطبيق

المتطلبات: JDK 17 وAndroid SDK 35 وAndroid NDK 23.1.7779620.

من مجلد `apps/multiplatform` نفّذ:

```bash
./gradlew --no-daemon :android:assembleFossDebug
```

تجد ملفات APK الناتجة داخل:

```
apps/multiplatform/android/build/outputs/apk/foss/debug/
```

يتضمن المستودع مسارات بناء آلية لإصدار Android التجريبي والإصدار الموقّع. ويتطلب الإصدار الموقّع مفاتيح المستودع السرية الموضحة أعلاه.

## الترخيص والإشعارات

تخضع شيفرة التطبيق لترخيص **GNU AGPLv3**، راجع ملف [LICENSE](LICENSE). وتبقى تراخيص وإشعارات حقوق المكونات الخارجية محفوظة وفق شروط كل مكوّن.

*ملاحظة المصدر: دوڤيرا نسخة مشتقة مستقلة الصيانة من الشيفرة المفتوحة المصدر لمشروع SimpleX Chat، وليست التطبيق الرسمي لذلك المشروع. ولا تُستخدم علاماته أو شعاراته ضمن هوية دوڤيرا.*
