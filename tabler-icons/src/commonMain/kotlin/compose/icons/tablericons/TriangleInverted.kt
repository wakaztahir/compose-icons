package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.TriangleInverted: ImageVector
    get() {
        if (_triangleInverted != null) {
            return _triangleInverted!!
        }
        _triangleInverted = Builder(name = "TriangleInverted", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 4.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.84f, 2.75f)
                lineToRelative(-7.1f, 12.25f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -3.5f, 0.0f)
                lineToRelative(-7.1f, -12.25f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.75f, -2.75f)
            }
        }
        .build()
        return _triangleInverted!!
    }

private var _triangleInverted: ImageVector? = null
