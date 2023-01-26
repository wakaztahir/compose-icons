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

public val OutlineGroup.LensBlur: ImageVector
    get() {
        if (_lensBlur != null) {
            return _lensBlur!!
        }
        _lensBlur = Builder(name = "LensBlur", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 13.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveTo(6.55f, 13.0f, 6.0f, 13.0f)
                close()
                moveTo(6.0f, 17.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveTo(6.55f, 17.0f, 6.0f, 17.0f)
                close()
                moveTo(6.0f, 9.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveTo(6.55f, 9.0f, 6.0f, 9.0f)
                close()
                moveTo(3.0f, 9.5f)
                curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveTo(3.28f, 9.5f, 3.0f, 9.5f)
                close()
                moveTo(6.0f, 5.0f)
                curveTo(5.45f, 5.0f, 5.0f, 5.45f, 5.0f, 6.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveTo(6.55f, 5.0f, 6.0f, 5.0f)
                close()
                moveTo(21.0f, 10.5f)
                curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveTo(21.28f, 9.5f, 21.0f, 9.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveTo(20.72f, 10.5f, 21.0f, 10.5f)
                close()
                moveTo(14.0f, 7.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveTo(13.45f, 7.0f, 14.0f, 7.0f)
                close()
                moveTo(14.0f, 3.5f)
                curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveTo(14.28f, 2.5f, 14.0f, 2.5f)
                reflectiveCurveTo(13.5f, 2.72f, 13.5f, 3.0f)
                reflectiveCurveTo(13.72f, 3.5f, 14.0f, 3.5f)
                close()
                moveTo(3.0f, 13.5f)
                curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveTo(3.28f, 13.5f, 3.0f, 13.5f)
                close()
                moveTo(10.0f, 20.5f)
                curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveTo(10.28f, 20.5f, 10.0f, 20.5f)
                close()
                moveTo(10.0f, 3.5f)
                curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveTo(10.28f, 2.5f, 10.0f, 2.5f)
                reflectiveCurveTo(9.5f, 2.72f, 9.5f, 3.0f)
                reflectiveCurveTo(9.72f, 3.5f, 10.0f, 3.5f)
                close()
                moveTo(10.0f, 7.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveTo(9.0f, 5.45f, 9.0f, 6.0f)
                reflectiveCurveTo(9.45f, 7.0f, 10.0f, 7.0f)
                close()
                moveTo(10.0f, 12.5f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveTo(10.83f, 12.5f, 10.0f, 12.5f)
                close()
                moveTo(18.0f, 13.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveTo(18.55f, 13.0f, 18.0f, 13.0f)
                close()
                moveTo(18.0f, 17.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveTo(18.55f, 17.0f, 18.0f, 17.0f)
                close()
                moveTo(18.0f, 9.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveTo(18.55f, 9.0f, 18.0f, 9.0f)
                close()
                moveTo(18.0f, 5.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveTo(18.55f, 5.0f, 18.0f, 5.0f)
                close()
                moveTo(21.0f, 13.5f)
                curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveTo(21.28f, 13.5f, 21.0f, 13.5f)
                close()
                moveTo(14.0f, 17.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveTo(14.55f, 17.0f, 14.0f, 17.0f)
                close()
                moveTo(14.0f, 20.5f)
                curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveTo(14.28f, 20.5f, 14.0f, 20.5f)
                close()
                moveTo(10.0f, 8.5f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveTo(10.83f, 8.5f, 10.0f, 8.5f)
                close()
                moveTo(10.0f, 17.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveTo(10.55f, 17.0f, 10.0f, 17.0f)
                close()
                moveTo(14.0f, 12.5f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveTo(14.83f, 12.5f, 14.0f, 12.5f)
                close()
                moveTo(14.0f, 8.5f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveTo(14.83f, 8.5f, 14.0f, 8.5f)
                close()
            }
        }
        .build()
        return _lensBlur!!
    }

private var _lensBlur: ImageVector? = null
