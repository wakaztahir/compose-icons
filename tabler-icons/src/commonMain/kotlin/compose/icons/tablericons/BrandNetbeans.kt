package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.BrandNetbeans: ImageVector
    get() {
        if (_brandNetbeans != null) {
            return _brandNetbeans!!
        }
        _brandNetbeans = Builder(name = "BrandNetbeans", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 6.873f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.0f, 1.747f)
                verticalLineToRelative(6.536f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.029f, 1.748f)
                lineToRelative(-6.0f, 3.833f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.942f, 0.0f)
                lineToRelative(-6.0f, -3.833f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.029f, -1.747f)
                verticalLineToRelative(-6.537f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.029f, -1.748f)
                lineToRelative(6.0f, -3.572f)
                arcToRelative(2.056f, 2.056f, 0.0f, false, true, 2.0f, 0.0f)
                lineToRelative(6.0f, 3.573f)
                horizontalLineToRelative(-0.029f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.5f, 9.43f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.5f, 0.874f)
                verticalLineToRelative(3.268f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.515f, 0.874f)
                lineToRelative(-3.0f, 1.917f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.97f, 0.0f)
                lineToRelative(-3.0f, -1.917f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.515f, -0.873f)
                verticalLineToRelative(-3.269f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.514f, -0.874f)
                lineToRelative(3.0f, -1.786f)
                curveToRelative(0.311f, -0.173f, 0.69f, -0.173f, 1.0f, 0.0f)
                lineToRelative(3.0f, 1.787f)
                horizontalLineToRelative(-0.014f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 21.0f)
                verticalLineToRelative(-9.0f)
                lineToRelative(-7.5f, -4.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                lineToRelative(7.5f, -4.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                verticalLineToRelative(4.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.5f, 16.0f)
                lineToRelative(-3.5f, -2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 14.0f)
                lineToRelative(-3.5f, 2.0f)
            }
        }
        .build()
        return _brandNetbeans!!
    }

private var _brandNetbeans: ImageVector? = null
