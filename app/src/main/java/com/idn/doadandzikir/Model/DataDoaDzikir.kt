package com.idn.doadandzikir.Model

object DataDoaDzikir {

    private val descQauliyah = arrayOf(
        "Membaca do'a istiftah:",
        "Membaca isti'adzah setelah membaca do'a istiftah:",
        "Mengucapkan aamiin begitu selesai membaca Surat Al-Fatihah:",
        "Membaca surat Al-Qur'an setelah selesai membaca Al-Fatihah:",
        "Membaca tasbih saat ruku' dan sujud:",
        "Membaca do'a iktidal (bangkit dari ruku):",
        "Membaca do'a di antara 2 sujud:",
        "Mengucapkan shalawat atas Nabi Shallallahu 'alaihi wa sallam setelah tasyahhud awal:",
        "Membaca do'a baik setelah tasyahud awal maupun kedua:",
        "Mengucapkan salam yang kedua:"
    )

    private val lafazQauliyah = arrayOf(
        "اَللَّهُمَّ بَاعِدْ بَيْنِى وَبَيْنَ خَطَايَاىَ كَمَا بَاعَدْتَ بَيْنَ الْمَشْرِقِ وَالْمَغْرِبِ . اللَّهُمَّ نَقِّنِى مِنَ الْخَطَايَا كَمَا يُنَقَّى الثَّوْبُالأَبْيَضُ مِنَ الدَّنَسِ . اللَّهُمَّ اغْسِلْ خَطَايَاىَ بِالْمَاءِ وَالثَّلْجِ وَالْبَرَدِِ",
        "أَعُوْذُ بِـاللهِ السَّمِيْعِ الْعَلِيْمِ مِنَ الشَّيْطَانِ الرَّجِيْمِ مِنْ هَمْزِهِ وَنَفْخِهِ وَنَفَثِهِ",
        "آمِيْن",
        "Dari Abu Qatadah Radhiyallahu anhu, dia berkata:\n\"Pada dua raka'at pertama shalat Zhuhur, Nabi Shallallahu 'alaihim membaca al-Faatihah dan dua surat. Beliau memanjangkan raka'at pertama dan memendekkan raka'at kedua. Terkadang beliau memperdengarkan (bacaan) ayatnya. Pada dua raka'at pertama shalat 'Ashar beliau juga membaca al-Faatihah dan dua surat. Beliau memanjangkan raka'at pertama shalat Shubuh dan memendekkan raka'at kedua.\"",
        "Tasbih saat ruku:\nسُبْحَانَ رَبِّيَ الْعَظِيْمِ\nTasbih saat sujud:\nسُبْحَانَ رَبِّيَ اْلأَعْلَى",
        "سَمِعَ اللَّهُ لِمَنْ حَمِدَ هُ. رَبَّنَا وَلَكَ الْحَمْدُ. مِلْءَ السَّمَاوَاتِ وَمِلْءَ اْلأَرْضِ وَمَا بَيْنَهُمَا، وَمِلْءَ مَا شِئْتَ مِنْ شَيْءٍ بَعْدُ",
        "اَللّهُمَّ اغْفِرْ لِيْ وَارْحَمْنِيْ وَاجْبُرْنِيْ وَاهْدِنِيْ وَارْزُقْنِيْ",
        "اللَّهُمَّ صَلِّ عَلَى مُحَمَّدٍ وَعَلَى آلِ مُحَمَّدٍ كَمَا صَلَّيْتَ عَلَى إِبْرَاهِيمَ وَعَلَى آلِ إِبْرَاهِيمَ إِنَّكَ حَمِيدٌ مَجِيدٌ اللَّهُمَّ بَارِكْ فِي رِوَايَةٍ: وَ بَارِكْ عَلَى مُحَمَّدٍ وَعَلَى آلِ مُحَمَّدٍ كَمَا بَارَكْتَ عَلَى إِبْرَاهِيمَ وَعَلَى آلِ إِبْرَاهِيمَ إِنَّكَ حَمِيدٌ مَجِيدٌ",
        "اَلتَّحِيَّاتُ للهِ، وَالصَّلَوَاتُ وَالطَّيِّبَـاتُ، اَلسَّلاَمُ عَلَيْكَ أَيُّهَا النَّبِيُّ وَرَحْمَةُ اللهِ وَبَرَكَاتُهُ، اَلسَّلاَمُ عَلَيْنَا وَعَلى عِبَادِ اللهِ الصَّالِحِيْنَ، أَشْهَدُ أَنْ لاَ إِلهَ إِلاَّ اللهُ وَأَشْـهَدُ أَنَّ مُحَمَّدًا عَبْدُهُ وَرَسُوْلُهُ. ثُمَّ لِيَتَّخِيْرَ أَحَدُكُمْ مِنَ الدُّعَاءِ أَعْجَبُهُ إِلَيْهِ، فَلْيَدْعُ رَبَّهُ عزوجل.",
        "Salam yang pertama:\n اَلسَّلاَمُ عَلَيْكُمْ وَرَحْمَةُ اللهِ وَبَرَكَاتُهُ\nSalam yang kedua:\nاَلسَّلاَمُ عَلَيْكُمْ وَرَحْمَ"
    )

    private val terjemahQauliyah = arrayOf(
        "\"Ya Allah, jauhkanlah antara aku dan dosaku sebagaimana Kau jauhkan antara timur dan barat. Ya Allah, sucikanlah aku dari dosa-dosaku sebagaimana kain putih tersuci dari noda. Ya Allah, basuhlah aku dari dari dosa-dosaku dengan salju, air, dan es (embun).\"",
        "\"Aku berlindung kepada Allah Yang Maha Mendengar lagi Maha Melihat dari syaitan yang terkutuk, dari bisikan, tiupan, dan godaannya.\"",
        "\"Ya Allah, kabulkanlah do'a kami.\"",
        "\"Shahih: [Shahiih Sunan an-Nasa-i (no. 932)] dan Shahiih al-Bukhari (Fat-hul Baari) (II/243 no. 759).\"",
        "Tasbih saat ruku:\n\"Mahasuci Rabb-ku Yang Mahaagung.\"\n\nTasbih saat sujud:\n\"Mahasuci Rabb-ku Yang Mahatinggi.\"",
        "\"Allah Maha Mendengar orang yang memuji-Nya. bagi-Mu-lah segenap pujian yang baik dan penuh berkah. Sebagaimana yang disukai Rabb kami dan di-ridhai-Nya.\"",
        "\"Ya Allah, ampunilah aku, sayangilah aku, cukupilah kekuranganku, tunjukilah aku dan karuniakanlah rizki kepadaku.\"",
        "\"Ya, Allah. Berilah (yakni, tambahkanlah) shalawat (sanjungan) kepada Muhammad dan kepada keluarga Muhammad, sebagaimana Engkau telah memberi shalawat kepada Ibrahim dan kepada keluarga Ibrahim, sesungguhnya Engkau Maha Terpuji (lagi) Maha Mulia. Ya, Allah. Berilah berkah (tambahan kebaikan) kepada Muhammad dan kepada keluarga Muhammad, sebagaimana Engkau telah memberi berkah kepada Ibrahim dan kepada keluarga Ibrahim, sesungguhnya Engkau Maha Terpuji (lagi) Maha Mulia.\"",
        "\"Segala penghormatan hanya bagi Allah. Begitupula seluruh pengagungan dan kebaikan. Semoga kesejahteraan terlimpahkan atas engkau, wahai Nabi. Begitupula kasih sayang Allah dan berkah-Nya. Mudah-mudahan kesejahteraan tercurahkan atas kita semua dan para hamba Allah yang shalih. Aku bersaksi tidak ada ilah yang layak diibadahi selain Allah. Dan aku bersaksi bahwa Muhammad adalah hamba dan Rasul-Nya. Setelah itu, hendaklah salah seorang di antara kalian memilih do'a yang paling ia sukai lalu hendaklah ia berdo'a kepada Rabb-nya Azza wa Jalla.\n",
        "Salam yang pertama:\n\"Semoga kesejahteraan terlimpahkan atas kamu sekalian, begitu pula rahmat Allah dan berkah-Nya.\n\nSalam yang kedua:\n\"Semoga kesejahteraan dan rahmat Allah tercurahkan kepada kamu sekalian\""
    )

    val listDataQauliyah : List<DoadanDzikirItem>
        get() {
            val listData = mutableListOf<DoadanDzikirItem>()
            for (index in descQauliyah.indices){
                val data = DoadanDzikirItem(
                    descQauliyah[index],
                    lafazQauliyah[index],
                    terjemahQauliyah[index]
                )
                listData.add(data)
            }
            return listData
        }

    private val descDzikir = arrayOf(
        "Tahlil",
        "Takbir",
        "Tahmid",
        "Tasbih",
        "Hauqolah",
        "Istighfar",
        "Shalawat"
    )

    private val lafazDzikir = arrayOf(
        "Pertama:\n لا إله إلا الله\nKedua:\nلَا إِلَـهَ إِلَّا اللهُ وَحْدَهُ لَا شَرِيْكَ لَهُلَهُ الْمُلْكُ وَلَهُ الْحَمْدُ وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيْرُ",
        "Umum:\nالله ُأَكبَرُ\nTakbir Hari Raya yang Diriwayatkan oleh\nJabir bin Abdillah:\nالله أكبر، الله أكبر، الله أكبر، لا إله إلا الله، والله أكبر، الله أكبر، ولله الحمد\nAbdullah bin Mas'ud:\nالله أكبر، الله أكبر، لا إله إلا الله، والله أكبر، الله أكبر، ولله الحمد\nIbnu Abbas:\nالله ُأَكبَرُ ، الله ُأَكبَرُ ، الله ُأَكبَرُ ، و للهِ الحَمدُ ، الله ُأَكبَرُ و أَجَلُّ ، الله ُأَكبَرُ عَلَى مَا هَدَانَا\nSalman:\nالله ُأَكبَرُ ، الله ُأَكبَرُ ، الله ُأَكبَرُ  كَبِيراً",
        "Pertama:\nالحمد لله\nKedua:\nالحمد لله رب العالمين\nKetiga:\nالحمد لله حمدا كثيرا طيبا مباركا فيه\nKeempat:\nربنا لك الحد\nKelima:\nاللهم ربنا لك الحمد",
        "Pertama:\nسُبْحَانَ اللهِ\nKedua:\nسُبْحَانَ رَبِّىَ الْعَظِيمِ\nKetiga:\nسُبُّوحٌ قُدُّوسٌ رَبُّ الْمَلاَئِكَةِ وَالرُّوحِ\nKeempat:\nسُبْحَانَ ذِي الجَبَرُوْتِ وَالملَكُوْتِ وَالكِبْرِيَاء ِوَالعَظَمَةِ\nKelima:\nسُبْحَانَ رَبِّىَ الأَعْلَ",
        "لاحول ولا قوة الا بالله",
        "Pertama:\nأَسْتَغْفِرُ اللهَ\nKedua:\nأَسْتَغْفِرُ اللهَ وَأَتُوبُ إِلَيْهِ\nKetiga:\nأَسْتَغْفِرُ اللَّهَ الْعَظِيمَ الَّذِي لَا إِلَهَ إِلَّا هُوَ الْحَيَّ الْقَيُّومَ وَأَتُوبُ إِلَيْه\nKeempat:\nرَبِّ اغْفِرْ لِى وَتُبْ عَلَىَّ إِنَّكَ أَنْتَ التَّوَّابُ الرَّحِيمُ",
        "اللَّهُّم صلِّ على محمدٍ وعلى آل محمد كما صلَّيْتَ على إبراهيم وعلى آل إبراهيم إنك حميد مجيد، اللَّهُّم بارِكْ على محمدٍ وعلى آل محمد كما باركتَ على إبراهيم وعلى آل إبراهيم إنك حميدٌ مجيد"
    )

    private val terjemahDzikir = arrayOf(
        "Pertama:\n\"Tidak ada ilah yang berhak disembah selain Allah semata.\"\n\nKedua:\n\"Tidak ada ilah yang berhak disembah selain Allah semata, tidak ada sekutu bagi-Nya. Milik Allah segala kerajaan dan pujian. Dia lah yang berkuasa atas segala sesuatu.\"",
        "Umum: \n\"Allah Maha Besar\"\n\nTakbir Hari Raya yang Diriwayatkan oleh\nJabir bin Abdillah:\n\"Allah Maha Besar, Allah Maha Besar, Allah Maha Besar, tidak ada ilah yang berhak disembah selain Allah, dan Allah Maha Besar, Allah Maha Besar dan segala puji bagi hanya Allah.\"\n\nAbdullah bin Mas'ud:\n\"Allah Maha Besar, Allah Maha Besar, tidak ada ilah yang berhak disembah selain Allah, dan Allah Maha Besar, Allah Maha Besar dan segala puji bagi hanya Allah.\"\n\nIbnu Abbas:\n\"Allah Maha Besar, Allah Maha Besar, Allah Maha Besar, dan Allah lah segala pujian, Allah Maha Besar dan Maha Mulia, Allah Maha Besar atas petunjuk yang diberikannya pada kita.\"\n\nSalman:\n\"Allah Maha Besar, Allah Maha Besar, Allah Maha Besar\"",
        "Pertama:\n\"Segala puji bagi Allah\"\n\nKedua:\n\"Segala puji bagi Allah, Tuhan seluruh alam.\"\n\nKetiga:\n\"Segala puji bagi Allah, pujian yang berlimpah, baik dan berkah.\"\n\nKeempat:\n\"Wahai Rabb kami, segala puji bagi-Mu.\"\n\nKelima:\n\"Ya Allah, Rabb kami, segala puji bagi-Mu.\"",
        "Pertama:\n\"Maha Suci Allah\"\n\nKedua:\n\"Maha Suci Allah Yang Maha Agung\"\n\nKetiga:\n\"Maha Suci Allah Rabb para Malaikat dan Ar Ruuh (Jibril)\"\n\nKeempat:\n\"Maha Suci Allah Yang mempunyai keperkasaan dan kerajaan (penuh) serta kesombongan dan keagungan\"\n\nKelima:\n\"Maha Suci Rabbku Yang Maha Tinggi\"",
        "\"Tidak ada daya dan upaya kecuali dengan pertolongan Allah\"",
        "Pertama:\n\"Aku memohon ampun kepada Allah\"\n\nKedua:\n\"Aku memohon maghiroh Allah dan aku bertaubat kepada-Nya\"\n\nKetiga:\n\"Aku memohon ampunan kepada Allah yang tidak ada sesembahan yang berhak disembah kecuali Dia, Yang Maha Hidup dan Maha Tegak dan aku bertaubat kepada-Nya\"\n\nKeempat:\n\"Ya Rabbku ampunilah aku dan bimbinglah aku untuk bertaubat (atau terimalah tabatku) sesungguhnya Engkau adalah Maha Penerima Taubat dan Maha Rahmat\"",
        "\"Ya Allah, semoga shalawat tercurah kepada Muhammad dan keluarga Muhammad sebagaimana tercurah pada Ibrahim dan keluarga Ibrahim, sesungguhnya Engkau Maha Terpuji lagi Maha Mulia. Ya Allah, semoga berkah tercurah kepada Muhammad dan keluarga Muhammad sebagaimana tercurah pada Ibrahim dan keluarga Ibrahim, sesungguhnya Engkau Maha Terpuji lagi Maha Mulia.\""
    )

    val listDzikir : List<DoadanDzikirItem>
        get() {
            val listData = mutableListOf<DoadanDzikirItem>()
            for (index in descDzikir.indices){
                val data = DoadanDzikirItem(
                    descDzikir[index],
                    lafazDzikir[index],
                    terjemahDzikir[index]
                )
                listData.add(data)
            }
            return listData
        }

}