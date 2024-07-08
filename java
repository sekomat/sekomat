document.getElementById('student-form').addEventListener('submit', function(event) {
    event.preventDefault();

    const studentName = document.getElementById('student-name').value;
    const studentId = document.getElementById('student-id').value;
    const bookTitle = document.getElementById('book-title').value;
    const bookAuthor = document.getElementById('book-author').value;
    const startDate = document.getElementById('start-date').value;
    const endDate = document.getElementById('end-date').value;
    const pagesRead = document.getElementById('pages-read').value;
    const totalPages = document.getElementById('total-pages').value;
    const subject = document.getElementById('subject').value;
    const studySource = document.getElementById('study-source').value;
    const examDate = document.getElementById('exam-date').value;
    const correctAnswers = document.getElementById('correct-answers').value;
    const wrongAnswers = document.getElementById('wrong-answers').value;
    const wrongSubjects = document.getElementById('wrong-subjects').value;

    const resultDiv = document.getElementById('result');
    resultDiv.innerHTML = `
        <h2>Kaydedilen Bilgiler</h2>
        <p><strong>Öğrenci Adı:</strong> ${studentName}</p>
        <p><strong>Öğrenci Numarası:</strong> ${studentId}</p>
        <p><strong>Kitap Adı:</strong> ${bookTitle}</p>
        <p><strong>Yazar:</strong> ${bookAuthor}</p>
        <p><strong>Başlangıç Tarihi:</strong> ${startDate}</p>
        <p><strong>Bitiş Tarihi:</strong> ${endDate}</p>
        <p><strong>Okunan Sayfa Sayısı:</strong> ${pagesRead}</p>
        <p><strong>Toplam Sayfa Sayısı:</strong> ${totalPages}</p>
        <p><strong>Ders Adı:</strong> ${subject}</p>
        <p><strong>Çalışılan Kaynak:</strong> ${studySource}</p>
        <p><strong>Deneme Sınavı Tarihi:</strong> ${examDate}</p>
        <p><strong>Doğru Sayısı:</strong> ${correctAnswers}</p>
        <p><strong>Yanlış Sayısı:</strong> ${wrongAnswers}</p>
        <p><strong>Yanlış Yapılan Dersler:</strong> ${wrongSubjects}</p>
    `;
});
