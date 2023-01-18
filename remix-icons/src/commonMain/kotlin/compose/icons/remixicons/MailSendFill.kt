package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.MailSendFill: ImageVector
    get() {
        if (_mailSendFill != null) {
            return _mailSendFill!!
        }
        _mailSendFill = Builder(name = "MailSendFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 5.5f)
                lineTo(2.0f, 3.993f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 2.992f, 3.0f)
                horizontalLineToRelative(18.016f)
                curveToRelative(0.548f, 0.0f, 0.992f, 0.445f, 0.992f, 0.993f)
                verticalLineToRelative(16.014f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.992f, 0.993f)
                lineTo(2.992f, 21.0f)
                arcTo(0.993f, 0.993f, 0.0f, false, true, 2.0f, 20.007f)
                lineTo(2.0f, 19.0f)
                horizontalLineToRelative(18.0f)
                lineTo(20.0f, 7.3f)
                lineToRelative(-8.0f, 7.2f)
                lineToRelative(-10.0f, -9.0f)
                close()
                moveTo(0.0f, 10.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                lineTo(0.0f, 12.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(0.0f, 15.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                lineTo(0.0f, 17.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _mailSendFill!!
    }

private var _mailSendFill: ImageVector? = null