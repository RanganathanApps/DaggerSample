package app.shamlatech.startup.ui

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import apps.ranganathan.configlibrary.base.BaseAppActivity
import apps.ranganathan.configlibrary.utils.PrefsManger
import development.app.checking.app.App
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper
import javax.inject.Inject

open class BaseActivity : BaseAppActivity(){

    override fun attachBaseContext(newBase: Context) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase))
    }

}
