package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.NearMe: ImageVector
    get() {
        if (_nearMe != null) {
            return _nearMe!!
        }
        _nearMe = Builder(name = "NearMe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.27f, 6.73f)
                lineToRelative(-4.24f, 10.13f)
                lineToRelative(-1.32f, -3.42f)
                lineToRelative(-0.32f, -0.83f)
                lineToRelative(-0.82f, -0.32f)
                lineToRelative(-3.43f, -1.33f)
                lineToRelative(10.13f, -4.23f)
                moveTo(21.0f, 3.0f)
                lineTo(3.0f, 10.53f)
                verticalLineToRelative(0.98f)
                lineToRelative(6.84f, 2.65f)
                lineTo(12.48f, 21.0f)
                horizontalLineToRelative(0.98f)
                lineTo(21.0f, 3.0f)
                close()
            }
        }
        .build()
        return _nearMe!!
    }

private var _nearMe: ImageVector? = null
