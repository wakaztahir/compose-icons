package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.Airplay: ImageVector
    get() {
        if (_airplay != null) {
            return _airplay!!
        }
        _airplay = Builder(name = "Airplay", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 22.0f)
                horizontalLineToRelative(12.0f)
                lineToRelative(-6.0f, -6.0f)
                lineTo(6.0f, 22.0f)
                close()
                moveTo(23.0f, 3.0f)
                horizontalLineTo(1.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _airplay!!
    }

private var _airplay: ImageVector? = null