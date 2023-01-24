package com.preon93.periodictable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val periodic_num: TextView = findViewById(R.id.periodic_num)
        val element_ans: TextView = findViewById(R.id.element_ans)
        val btn_next: Button = findViewById(R.id.btn_next)
        val btn_answer: Button = findViewById(R.id.btn_answer)
        val element_kor = listOf("수소","헬륨","리튬","베릴륨","붕소","탄소","질소","산소","플루오린","네온","나트륨","마그네슘","알루미늄","규소","인","황","염소","아르곤","칼륨","칼슘","스칸듐","타이타늄","바나듐","크로뮴","망가니즈","철","코발트","니켈","구리","아연","갈륨","게르마늄","비소","셀레늄","브로민","크립톤","루비듐","스트론튬","이트륨","지르코늄","나이오븀","몰리브데넘","테크네튬","루테늄","로듐","팔라듐","은","카드뮴","인듐","주석","안티모니","텔루륨","아이오딘","제논","세슘","바륨","란타넘","세륨","프라세오디뮴","네오디뮴","프로메테늄","사마륨","유로퓸","가돌리늄","터븀","디스프로슘","홀뮴","어븀","톨륨","이터븀","루테튬","하프늄","탄탈럼","텅스텐","레늄","오스뮴","이리듐","백금","금","수은","탈륨","납","비스무트","폴로늄","아스타틴","라돈","프랑슘","라듐","악티늄","토륨","프로트악티늄","우라늄","넵투늄","플루토늄","아메리슘","퀴륨","버클륨","캘리포늄","아인슈타이늄","페르뮴","멘델레븀","노벨륨","로렌슘","러더포듐","더브늄","시보귬","보륨","하슘","마이트너륨","다름슈타튬","뢴트게늄","코페르니슘","니호늄","플레로븀","모스코븀","리버모륨","테네신","오가네손")
        val element_eng = listOf("H","He","Li","Be","B","C","N","O","F","Ne","Na","Mg","Al","Si","P","S","Cl","Ar","K","Ca","Sc","Ti","V","Cr","Mn","Fe","Co","Ni","Cu","Zn","Ga","Ge","As","Se","Br","Kr","Rb","Sr","Y","Zr","Nb","Mo","Tc","Ru","Rh","Pd","Ag","Cd","In","Sn","Sb","Te","I","Xe","Cs","Ba","La","Ce","Pr","Nd","Pm","Sm","Eu","Gd","Tb","Dy","Ho","Er","Tm","Yb","Lu","Hf","Ta","W","Re","Os","Ir","Pt","Au","Hg","Tl","Pb","Bi","Po","At","Rn","Fr","Ra","Ac","Th","Pa","U","Np","Pu","Am","Cm","Bk","Cf","Es","Fm","Md","No","Lr","Rf","Db","Sg","Bh","Hs","Mt","Ds","Rg","Cn","Nh","Fl","Mc","Lv","Ts","Og")

        btn_next.setOnClickListener {
            element_ans.text = null
            val random_num = Random()
            val element_num = random_num.nextInt(118)+1
            val element = element_eng[element_num-1]+" , "+element_kor[element_num-1]
            periodic_num.text = element_num.toString()
            btn_answer.setOnClickListener {
                element_ans.text = element
            }
        }
    }
}